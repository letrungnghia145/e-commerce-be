package com.tmdt.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tmdt.app.model.Package;
import com.tmdt.app.repository.PackageRepository;
import com.tmdt.app.service.PackageService;
import com.tmdt.app.utils.Converter;

@Service
public class PackageServiceImpl implements PackageService {
	@Autowired
	private PackageRepository repository;

	@Override
	public List<Package> getAll() {
		return repository.findAll();
	}

	@Override
	public Package getOne(Long id) {
		Optional<Package> findById = repository.findById(id);
		return findById.get();
	}

	@Override
	public void add(Package entity) {
		repository.save(entity);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		repository.delete(repository.getOne(id));

	}

	@Override
	@Transactional
	public void update(Package entity) {
		repository.findById(entity.getId()).ifPresent(bo -> {
			try {
				Converter.convert(entity, bo);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

}
