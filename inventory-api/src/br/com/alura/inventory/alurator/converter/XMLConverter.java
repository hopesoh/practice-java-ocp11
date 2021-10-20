package br.com.alura.inventory.alurator.converter;

import br.com.alura.inventory.alurator.converter.annotation.XMLTagName;

import java.lang.reflect.Field;
import java.util.Collection;

public class XMLConverter {

    public String convert(Object reflected) {
        try {
            Class<?> objectClass = reflected.getClass();
            StringBuilder xmlBuilder = new StringBuilder();
            populateXml(reflected, objectClass, xmlBuilder);

            return xmlBuilder.toString();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException("Erro na geração do XML!");
        }
    }

    private void populateXml(Object reflected, Class<?> objectClass, StringBuilder xmlBuilder) throws IllegalAccessException {
        if (reflected instanceof Collection) createTagList((Collection<?>) reflected, xmlBuilder);
        else populateContent(reflected, objectClass, xmlBuilder);
    }

    private void populateContent(Object reflected, Class<?> objectClass, StringBuilder xmlBuilder) throws IllegalAccessException {
        XMLTagName declaredAnnotation = objectClass.getDeclaredAnnotation(XMLTagName.class);
        String className = declaredAnnotation != null ? declaredAnnotation.value() : objectClass.getName();

        createTagClass(reflected, objectClass, xmlBuilder, className);
    }

    private void createAttributeTag(Object reflected, Class<?> objectClass, StringBuilder xmlBuilder) throws IllegalAccessException {
        for (Field attribute : objectClass.getDeclaredFields()) {
            attribute.setAccessible(true);

            XMLTagName declaredAnnotationForAttribute = attribute.getDeclaredAnnotation(XMLTagName.class);
            String attributeName = declaredAnnotationForAttribute != null ? declaredAnnotationForAttribute.value() : attribute.getName();

            createTagAttribute(reflected, xmlBuilder, attribute, attributeName);
        }
    }

    private void createTagList(Collection<?> reflected, StringBuilder xmlBuilder) {
        xmlBuilder.append("<list>");
        for (Object o : reflected) xmlBuilder.append(convert(o));
        xmlBuilder.append("</list>");
    }

    private void createTagClass(Object reflected, Class<?> objectClass, StringBuilder xmlBuilder, String className) throws IllegalAccessException {
        xmlBuilder.append("<").append(className).append(">");
        createAttributeTag(reflected, objectClass, xmlBuilder);
        xmlBuilder.append("</").append(className).append(">");
    }

    private void createTagAttribute(Object reflected, StringBuilder xmlBuilder, Field attribute, String attributeName) throws IllegalAccessException {
        xmlBuilder.append("<").append(attributeName).append(">")
                .append(attribute.get(reflected))
                .append("</").append(attributeName).append(">");
    }
}
