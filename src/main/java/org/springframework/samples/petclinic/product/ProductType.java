package org.springframework.samples.petclinic.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product_types", uniqueConstraints =  @UniqueConstraint(columnNames = {"name"}))
public class ProductType extends BaseEntity{

    @Size(min = 3, max = 50)
	@Column(name = "name")
	private String name;
}
