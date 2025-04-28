package com.one.aim.bo;

<<<<<<< HEAD
=======
import java.time.LocalDateTime;

>>>>>>> 5d64f8d57e3fce7ec763847c0e2d0fb7ecd5efcf
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserBO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String username;

	private String email;

	private String phoneno;
<<<<<<< HEAD

	private String company;
=======
	
	private String company; 
>>>>>>> 5d64f8d57e3fce7ec763847c0e2d0fb7ecd5efcf

	private String service;

	private String message;
<<<<<<< HEAD

	private String url;

	private String date;

	private String timeslot;

	private String timezone;

}
=======
	
	private String url;
	
	private String date;

	private String timeslot;
	
	private String timezone;

	private LocalDateTime createdby;

	private LocalDateTime updatedby;
}
>>>>>>> 5d64f8d57e3fce7ec763847c0e2d0fb7ecd5efcf
