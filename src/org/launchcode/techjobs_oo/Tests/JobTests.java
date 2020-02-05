package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JobTests {
   Job test_job1;
   Job test_job2;
   Job test_job3;
   Job test_job4;
   Job test_job5;
   Job test_job6;

   @Before
    public void createJobObject() {
      test_job1 = new Job();
      test_job2 = new Job();
      test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      test_job5 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      test_job6 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
   }
   @Test
   public void testEmpty() {
       assertEquals(1, test_job1.getId(), .001);
       assertEquals(2, test_job2.getId(), .001);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job3 instanceof Job);
        assertEquals("Product tester", test_job3.getName());
        assertEquals("ACME", test_job3.getEmployer().getValue());
        assertEquals("Desert", test_job3.getLocation().getValue());
        assertEquals("Quality control", test_job3.getPositionType().getValue());
        assertEquals("Persistence", test_job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
       assertTrue(test_job3 != test_job4);
    }

    @Test
    public void testJobToString() {
        assertEquals("\n" +
                "ID: 3\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n", test_job3.toString());
    }

    @Test
    public void testJobToStringEmptyValue() {
        assertEquals("\n" +
                "ID: 5\n" +
                "Name: Product tester\n" +
                "Employer: Data not available\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n", test_job5.toString());
    }

    @Test
    public void testJobToStringLines() {
        assertEquals("OOPS! This job does not seem to exist.", test_job6.toString());
    }

}
