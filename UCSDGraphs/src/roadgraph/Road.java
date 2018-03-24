package roadgraph;

import geography.GeographicPoint;

public class Road {
	private GeographicPoint from;
	private GeographicPoint to;
	private String roadName;
	private String roadType; 
	private double length;
	public Road(GeographicPoint from, GeographicPoint to, String roadName,
			String roadType, double length) {
		this.setFrom(from);
		this.setTo(to);
		this.setRoadName(roadName);
		this.setRoadType(roadType);
		this.setLength(length);
	}
	public GeographicPoint getFrom() {
		return from;
	}
	public void setFrom(GeographicPoint from) {
		this.from = from;
	}
	public GeographicPoint getTo() {
		return to;
	}
	public void setTo(GeographicPoint to) {
		this.to = to;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public String getRoadType() {
		return roadType;
	}
	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
}
