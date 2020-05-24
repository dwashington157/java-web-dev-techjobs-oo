package Test;
import org.junit.Before;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.Job;
import static org.junit.Assert.*;


public class JobTest {
    Job job_test;
    Job job_testTwo;
    Job jobFieldsOne;
    Job jobFieldsTwo;


    @Before
    public void createJobObject(){
        job_test = new Job(30);
    }

    @Before
    public void createJobObjectTwo(){
        job_testTwo = new Job(31);
    }

    @Before
    public void createJobSame(){
        jobFieldsOne = new Job(30,"Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Before
    public void createJobSameTwo(){
        jobFieldsTwo = new Job(31,"Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void jobIdNotTheSame(){
        assertFalse(job_test.equals(job_testTwo));

}

    @Test
    public void testIfIdGiven(){
        assertEquals(30, job_test.getUniqueId(),.001);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job_fields= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job_fields instanceof Job);
    }


    @Test
    public void testForEquality() {
        assertFalse(jobFieldsOne.equals(jobFieldsTwo));

    }



}
