package particles.tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import particles.Particle;
import structures.CartesianPosition;

public class ParticleTests {

	private Particle particle;

	@Before
	public void init(){
		particle = new Particle();
	}
	
	@Test
	public void testDefaultParticleCreation(){
		assertEquals(particle.mass(), BigDecimal.valueOf(1));
		assertEquals(particle.position(), BigDecimal.valueOf(0));
		assertEquals(particle.velocity(), BigDecimal.valueOf(0));
		assertEquals(particle.charge(), BigDecimal.valueOf(0));
		assertEquals(particle.forces(), BigDecimal.valueOf(0));
		assertEquals(particle.acceleration(), BigDecimal.valueOf(0));
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
}
