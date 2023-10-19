package vo;

public class chat {
	private int Id;
	private String Name;
	private String Subject;
	private String Content;
	public chat() {
		super();
		// TODO Auto-generated constructor stub
	}
	public chat(String name, String subject, String content) {
		super();
		Name = name;
		Subject = subject;
		Content = content;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	
}
