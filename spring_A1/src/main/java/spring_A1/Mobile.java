package spring_A1;

public class Mobile {
private int id;
private String name;
private sim s;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public sim getS() {
	return s;
}
public void setS(sim s) {
	this.s = s;
}


@Override
public String toString() {
	return "Mobile [id=" + id + ", name=" + name + ", sim=" + s + "]";
}


}
