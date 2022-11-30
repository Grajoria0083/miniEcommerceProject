package com.masai.modal;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userLoginId;
	
	private String name;
	private String contact;
	private String password;
	private String email;
	private Double wallet;
	
	
	@Override
	public String toString() {
		return "User [userLoginId=" + userLoginId + ", name=" + name + ", contact=" + contact + ", password=" + password
				+ ", email=" + email + ", wallet=" + wallet + "]";
	}
	
	
	

}
