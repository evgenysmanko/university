package rtu.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank(message = "First name is required!")
    private String firstName;

    @NotBlank(message = "Last name is required!")
    private String lastName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private StudyGroup group;


}
