package particles.tests;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import particles.Particle;

public class ParticleTests {

	@Test
	public void testDefaultParticleCreation(){
		Particle particle = new Particle();
		assertEquals(particle.mass(), BigDecimal.valueOf(1));
		assertEquals(particle.position(), BigDecimal.valueOf(0));
		assertEquals(particle.velocity(), BigDecimal.valueOf(0));
		assertEquals(particle.charge(), BigDecimal.valueOf(0));
		assertEquals(particle.forces(), BigDecimal.valueOf(0));
		assertEquals(particle.acceleration(), BigDecimal.valueOf(0));
	}
}
