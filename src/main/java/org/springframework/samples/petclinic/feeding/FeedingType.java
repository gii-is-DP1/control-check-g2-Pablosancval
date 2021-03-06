package org.springframework.samples.petclinic.feeding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "feeding_types", uniqueConstraints = @UniqueConstraint(columnNames = {"name"}))
public class FeedingType extends BaseEntity{

    @NotNull
    @Size(min = 5, max = 30)
	@Column(name = "name")
    String name;

    @NotEmpty
    String description;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "pet_type_id")
    PetType petType;
}
