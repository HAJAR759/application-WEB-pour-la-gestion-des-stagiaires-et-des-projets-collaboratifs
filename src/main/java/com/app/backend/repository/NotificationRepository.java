package com.app.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.backend.model.Notification;

@Repository

public interface NotificationRepository extends JpaRepository<Notification,Long> {
	 List<Notification> findByUserIdAndIsReadFalse(Long userId);

	 int countByUserIdAndIsReadFalse(Long userId);
}