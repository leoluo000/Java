package libarysystem;

public class Books {
	private int ID;// 编号
	private String classify;// 分类
	private String bookname;// 书名
	private String author;// 作者
	private String press;// 出版社
	private int num;// 数量
	private double price;// 单价

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "%d,%s,%s,%s,%s,%d,%f"+this.ID+this.classify+this.bookname+this.author+this.press+this.num+this.price;
	}
	

}
