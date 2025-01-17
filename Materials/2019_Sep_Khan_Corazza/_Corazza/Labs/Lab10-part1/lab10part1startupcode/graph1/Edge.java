package lab10part1startupcode.graph1;


public class Edge {
	Vertex u;
	Vertex v;
	public Edge(Vertex u, Vertex v) {
		this.u=u;
		this.v = v;
	}
	
	public boolean equals(Object ob) {
		if(ob ==null) return false;
		if(ob.getClass() != getClass()) return false;
		Edge other = (Edge)ob;
		return (u.equals(other.u) && v.equals(other.v)) || (u.equals(other.v) 
				&& v.equals(other.u));
	}
	public int hashCode() {
		int result = 17;
		result += 31 * result + u.hashCode();
		result += 31 * result + v.hashCode();
		return result;
	}
	@Override
	public String toString() {
		return "(" + u.toString() + ", " + v.toString() + ")";
	}
}
