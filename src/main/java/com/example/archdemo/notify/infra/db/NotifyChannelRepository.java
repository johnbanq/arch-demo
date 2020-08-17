package com.example.archdemo.notify.infra.db;

import com.example.archdemo.notify.domain.entity.EmailNotifyChannel;
import org.springframework.data.repository.CrudRepository;

public interface NotifyChannelRepository extends CrudRepository<EmailNotifyChannel, Long> {
}
