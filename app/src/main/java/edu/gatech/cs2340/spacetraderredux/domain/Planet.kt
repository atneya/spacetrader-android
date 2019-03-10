package edu.gatech.cs2340.spacetraderredux.domain

import edu.gatech.cs2340.spacetraderredux.domain.entities.enums.PlanetName
import edu.gatech.cs2340.spacetraderredux.domain.entities.enums.Resource
import edu.gatech.cs2340.spacetraderredux.domain.entities.enums.TechLevel
import java.util.Random

class Planet(rand: Random) {

    val name: PlanetName
    val resource: Resource
    val techLevel: TechLevel

    init {
        this.name = PlanetName.values()[rand.nextInt(PlanetName.values().size)]
        this.resource = Resource.values()[rand.nextInt(Resource.values().size)]
        this.techLevel = TechLevel.values()[rand.nextInt(TechLevel.values().size)]
    }

    override fun toString(): String {
        return "Planet " + name.name + " with resource: " + resource.name + " and tech level: " + techLevel.name
    }
}