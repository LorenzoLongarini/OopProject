package it.univpm.objProject.model;
import java.sql.Timestamp;
import java.util.*;
import java.time.LocalDateTime;
import java.util.Date;


public class ModelExample {
	LocalDateTime dt = LocalDateTime.parse("2020-08-25T10:12:55Z");
	void f () {
		dt.getSecond();
	}
	public Timestamp client_modified;
}
