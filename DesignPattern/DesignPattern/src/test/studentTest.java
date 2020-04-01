package test;

import main.Student;
import main.studentDesignPattern;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import junit.framework.*;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class studentTest {
	private List<Student> Classmates;
	
	@Before
	public void setUp() throws Exception {
		Classmates = new ArrayList<Student>();
	}
	@Test
	public void testListInit() {
		assertTrue(Classmates.isEmpty());
		assertTrue(Classmates.size()==0);
	}
	@Test (expected = IllegalArgumentException.class)
	public void testInvalidCapacity(){
		Classmates = new ArrayList<Student>(-1);
	}
	
	@Test (expected = NullPointerException.class)
	public void testAddElementNull(){
		Classmates.add(0, null);
	}
	@Test (expected = IndexOutOfBoundsException.class)
	public void testRemoveWithEmptyList(){
		Classmates.remove(0);
	}
}