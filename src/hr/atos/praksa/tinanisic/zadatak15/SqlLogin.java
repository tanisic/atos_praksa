package hr.atos.praksa.tinanisic.zadatak15;

public class SqlLogin {
	private String username;
	private String password;
	private String hostname;
	
	public SqlLogin(String hostname,String username,String password){
		this.hostname=hostname;
		this.username=username;
		this.password=password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	
}
