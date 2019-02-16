package 超市会员管理系统;

public class Users {
    private String id;//账号
    private String password;//密码
    private int jifen;//积分

    public String getId() { return id; }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getJifen() {
        return jifen;
    }

    public void setJifen(int jifen) {
        this.jifen = jifen;
    }

    public Users(String id, String password, int jifen) {
        this.id = id;
        this.password = password;
        this.jifen = jifen;
    }
}
