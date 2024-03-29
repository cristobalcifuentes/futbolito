package com.futbolito.services.interfaces;

import com.futbolito.models.entities.Invitation;

public interface IInvitationService extends ICRUD<Invitation>{

	/**
	 * crear una invitacion de un jugador a otro jugador para ser parte de un equipo
	 * @param idTeam
	 * @param idguest
	 * @param idInvites
	 * @return
	 * @throws Exception
	 */
	Boolean createInvitationToTeam(Long idTeam, Long idguest, Long idInvites) throws Exception;

	/**
	 * pregunta si el atleta esta invitado al equipo
	 * @param idAthlete
	 * @param idTeam
	 * @return
	 */
	Boolean thisAthleteIsAGuest(Long idAthlete, Long idTeam);

	/**
	 * acepta la invitacion enviada para ser parte de un equipo
	 * @param idTeam
	 * @param Idguest
	 * @return
	 */
	Boolean acceptInvitationToTeam(Long idTeam, Long Idguest);

	/**
	 *  RECHAZAR la invitacion enviada para ser parte de un equipo
	 * @param idTeam
	 * @param Idguest
	 * @return
	 */
	Boolean rejectInvitationToTeam(Long idTeam, Long Idguest);

}
