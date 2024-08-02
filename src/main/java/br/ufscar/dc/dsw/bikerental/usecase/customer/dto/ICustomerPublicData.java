package br.ufscar.dc.dsw.bikerental.usecase.customer.dto;

// DTO (Data Transfer Object) interface to invert spring boot lib dependencies,
// respecting the decoupling of the use cases layer
public interface ICustomerPublicData {

    String id();

    String username();

    String name();

    String email();

    String phoneNumber();

}
