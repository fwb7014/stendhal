package games.stendhal.server.maps.deathmatch;

import games.stendhal.server.StendhalRPZone;
import games.stendhal.server.entity.player.Player;
import games.stendhal.server.util.Area;

/**
 * Stores information about the place of the deathmatch.
 *
 * @author hendrik
 */
public class DeathmatchInfo {

	private final DeathmatchArea arena;

	private final Spot entranceSpot;

	private final StendhalRPZone zone;

	/**
	 * Creates a new DeathmatchInfo
	 *
	 * @param arena
	 *            combat area
	 * @param zone
	 *            zone
	 */
	public DeathmatchInfo(final Area arena, final StendhalRPZone zone,
			final Spot entrance) {
		super();
		this.arena = new DeathmatchArea(arena);
		this.zone = zone;
		this.entranceSpot = entrance;
	}

	/**
	 * gets the arena
	 *
	 * @return combat area
	 */
	public Area getArena() {
		return arena.getArea();
	}

	/**
	 * gets the zone
	 *
	 * @return zone
	 */
	public StendhalRPZone getZone() {
		return zone;
	}

	public boolean isInArena(Player player) {
		return arena.contains(player);
	}

	Spot getEntranceSpot() {
		return entranceSpot;
	}
}
