module zoo.tours.hybrid {
	requires zoo.tours.api;
	provides zoo.tours.api.Tour with zoo.tours.hybrid.QuickTourImpl;
	uses zoo.tours.api.Tour;
}