package com.tmdt.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tmdt.app.model.Package;

public interface PackageRepository extends JpaRepository<Package, Long> {

}
