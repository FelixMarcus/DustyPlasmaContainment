package particles.tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import particles.Particle;
import structures.AccelerationVector;
import structures.CartesianPosition;
import structures.ForceVector;
import structures.VelocityVector;

public class ParticleTests {

	private Particle particle;

	@Before
	public void init(){
		particle = new Particle();
	}
	
	@Test
	public void testDefaultParticleCreation(){
		assertEquals(particle.mass(), BigDecimal.valueOf(1));
		assertEquals(particle.position(), new CartesianPosition(0, 0));
		assertEquals(particle.velocity(), new VelocityVector(0,0));
		assertEquals(particle.charge(), BigDecimal.valueOf(0));
		assertEquals(particle.forces(), new ForceVector(0,0));
		assertEquals(particle.acceleration(), new AccelerationVector(0, 0));	
	}
	
	@Test
	public void testSetParticleMass(){
		double testMass = 5;
		particle.setMass(BigDecimal.valueOf(testMass));
		assertEquals(particle.mass(), BigDecimal.valueOf(testMass));
	}
	
	@Test
	public void testParticleConstructorWithMassAndPosition(){
		BigDecimal testMass = BigDecimal.valueOf(5);
		CartesianPosition testPos = new CartesianPosition(5,5);
		particle = new Particle(testMass, testPos);
		
		assertEquals(particle.mass(), testMass);
		assertEquals(particle.position().x(), testPos.x());
		assertEquals(particle.position().y(), testPos.y());
	}
	
	@Test
	public void testParticleAddForces(){
		ForceVector testForce = new ForceVector(5, 5);
		particle.addForce(testForce);
		assertEquals(particle.forces(), new ForceVector(5, 5));
	}
	
	@Test
	public void testParticleAcceleration(){
		ForceVector testForce = new ForceVector(5, 5);
		particle.addForce(testForce);
		AccelerationVector testAcceleration = new AccelerationVector(5,5);
		assertEquals(particle.acceleration(), testAcceleration);
	}
	
	@Test
	public void testMoveParticle(){
		ForceVector testForce = new ForceVector(5, 5);
		BigDecimal testTime = BigDecimal.valueOf(1);
		CartesianPosition testFinalPosition = new CartesianPosition(BigDecimal.valueOf(2.500), BigDecimal.valueOf(2.500));
		
		particle.addForce(testForce);
		particle.accelerateFor(testTime);
				
		assertEquals(testFinalPosition, particle.position());
	}
	
	@Test
	public void testForcesReset(){
		ForceVector testForce = new ForceVector(5, 5);
		BigDecimal testTime = BigDecimal.valueOf(1);
		
		particle.addForce(testForce);
		particle.accelerateFor(testTime);
				
		assertEquals(particle.forces(), new ForceVector(0, 0));
	}
	
	@Test
	public void testSetCharge(){
		particle.setCharge(BigDecimal.valueOf(1));
		assertEquals(BigDecimal.valueOf(1), particle.charge());
	}
}
