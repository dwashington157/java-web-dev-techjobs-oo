package Test;
import org.junit.Before;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.Job;

import javax.lang.model.element.Name;

import static org.junit.Assert.*;


public class JobTest {
    Job job_test;
    Job job_testTwo;
    Job jobFieldsOne;
    Job jobFieldsTwo;



    @Before
    public void createJobSame(){
        job_test =new Job();
        job_testTwo = new Job();
        jobFieldsOne = new Job("", new Employer("ACMe"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobFieldsTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }


    @Test
    public void testSettingJobId(){
        assertEquals(job_test.getId(),job_testTwo.getId(), 1);

}



    @Test
    public void testJobConstructorSetsAllFields(){
        Job job_fields = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job_fields instanceof Job);
    }


    @Test
    public void testForEquality() {
        assertFalse(jobFieldsOne.equals(jobFieldsTwo));

    }

    @Test
    public void testToStringBeginsWithBlankLine(){

        assertTrue(jobFieldsOne.toString().startsWith("\n"));

    }


    @Test
    public void testToStringEndsBlankLine(){

        assertTrue(jobFieldsOne.toString().endsWith("\n"));
    }

    @Test
    public void testStringContains(){

//        assertTrue(jobFieldsOne.toString().contains(""));
    }

    @Test
    public void testStringEmpty(){

        assertTrue(jobFieldsOne.toString().contains("data not available"));
        System.out.println(jobFieldsOne);
    }
}
