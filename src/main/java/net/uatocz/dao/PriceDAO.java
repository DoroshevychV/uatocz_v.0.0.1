package net.uatocz.dao;

import net.uatocz.domain.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceDAO extends JpaRepository<Price,Integer> {
}
