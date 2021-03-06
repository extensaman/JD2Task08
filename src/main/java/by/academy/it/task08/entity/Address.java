package by.academy.it.task08.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "addr")
@Table
public class Address {
    // id, city, street, house
    /**
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    /**
     *
     */
    @Column
    private String city;
    /**
     *
     */
    @Column
    private String street;
    /**
     *
     */
    @Column
    private String house;
}
