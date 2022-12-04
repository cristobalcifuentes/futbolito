

package com.futbolito.controller;

import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.futbolito.models.DTOs.CreateInvitationTeamDto;
import com.futbolito.security.entity.MainUser;
import com.futbolito.services.interfaces.IInvitationService;

import lombok.Data;




@CrossOrigin
@RestController
@RequestMapping("invitation")
public class InvitationController {
	

	
	@Autowired
	private IInvitationService invitationService;
	
//	@PostMapping("/created-invitation")
//	public ResponseEntity<Boolean> createInvitationTeam(@RequestAttribute Long idTeam,  @RequestAttribute Long idGuest,
//			Authentication authentication) {
//		Long idUser = ((MainUser) authentication.getPrincipal()).getId();
//		try {
//			Boolean isCreated = invitationService.createInvitationToTeam(idTeam, idGuest, idUser);
//			if(isCreated) {
//				return new ResponseEntity<Boolean>(isCreated, HttpStatus.CREATED);
//			}
//		} catch (Exception e) { 
//			return new ResponseEntity<Boolean>(false, HttpStatus.BAD_REQUEST);
//		}
//
//		return null;
//	}
	
	@PostMapping("/created-invitation")
	public ResponseEntity<Boolean> createInvitationTeam(@RequestBody CreateInvitationTeamDto dto,
			Authentication authentication) {
		Long idUser = ((MainUser) authentication.getPrincipal()).getId();
		try {
			Boolean isCreated = invitationService.createInvitationToTeam(dto.getIdTeam() , dto.getIdGuest(), idUser);
			if(isCreated) {
				return new ResponseEntity<Boolean>(isCreated, HttpStatus.CREATED);
			}
		} catch (NoSuchElementException e){
			System.out.println(e);
		} catch (Exception e) { 
			return new ResponseEntity<Boolean>(false, HttpStatus.BAD_REQUEST);
		}

		return null;
	}
	
	
	

}


