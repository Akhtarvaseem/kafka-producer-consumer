package com.producer.setup.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor

public class Employee {

	private int id;
	private String name;
	private String address;
}