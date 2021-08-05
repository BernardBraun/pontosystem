package com.dio.pontosystem.repository;

import com.dio.pontosystem.model.JornadaTrabalho;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JornadaRepository implements JpaRepository<JornadaTrabalho,Long> {
    @Override
    public List<JornadaTrabalho> findAll() {
        return null;
    }

    @Override
    public List<JornadaTrabalho> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<JornadaTrabalho> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<JornadaTrabalho> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(JornadaTrabalho entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends JornadaTrabalho> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends JornadaTrabalho> S save(S entity) {
        return null;
    }

    @Override
    public <S extends JornadaTrabalho> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<JornadaTrabalho> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends JornadaTrabalho> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends JornadaTrabalho> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<JornadaTrabalho> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public JornadaTrabalho getOne(Long aLong) {
        return null;
    }

    @Override
    public JornadaTrabalho getById(Long aLong) {
        return null;
    }

    @Override
    public <S extends JornadaTrabalho> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends JornadaTrabalho> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends JornadaTrabalho> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends JornadaTrabalho> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends JornadaTrabalho> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends JornadaTrabalho> boolean exists(Example<S> example) {
        return false;
    }
}
