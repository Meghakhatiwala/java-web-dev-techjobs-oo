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

   @Before
    public void createJobObject() {
      test_job1 = new Job();
      test_job2 = new Job();
      test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
      test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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
}
