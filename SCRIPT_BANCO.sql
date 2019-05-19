create database db_porto;
-- drop database db_porto;
use db_porto;

create table TB_EMPRESA(
	cd_empresa int(10) not null auto_increment unique,
	nm_empresa VARCHAR(100) not null,
	cd_cnpj_empresa varchar(18) not null,
    sg_estado_empresa VARCHAR(2) not null,
	nm_cidade_empresa VARCHAR(50) not null,
	nm_endereco_empresa VARCHAR(100) not null,
	cd_endereco_empresa int(5) not null,
    PRIMARY KEY (`cd_empresa`)
);
create table TB_PRODUTO(
	cd_produto int(10) not null auto_increment unique,
    id_produto int(10) not null,
    cd_empresa int(10) not null unique,
    nm_produto varchar(100) not null,
    ds_produto varchar (200),
    PRIMARY KEY (`cd_produto`),
    FOREIGN KEY (`cd_empresa`) REFERENCES `TB_EMPRESA` (`cd_empresa`)
);
create table TB_PORTO(
	cd_porto int(10) not null auto_increment unique,
    nm_porto varchar(100) not null,
    sg_estado_porto varchar(2) not null,
    nm_cidade_porto VARCHAR(50) not null,
	nm_endereco_porto VARCHAR(100) not null,
	cd_endereco_porto int(5) not null,
    PRIMARY KEY (`cd_porto`)
);
create table TB_ARMAZEM(
	cd_armazem int(10) not null auto_increment unique,
    cd_porto int(10) not null unique,
    nm_armazem varchar(100) not null,
    PRIMARY KEY (`cd_armazem`),
    FOREIGN KEY (`cd_porto`) REFERENCES `TB_PORTO` (`cd_porto`)
);
create table TB_NAVIO(
	cd_navio int(10) not null auto_increment unique,
    nm_navio varchar(100) not null,
    ds_navio varchar(200),
    PRIMARY KEY (`cd_navio`)
);
create table TB_TRANSPORTE_NAVIO(
	cd_transporte_navio int(10) not null auto_increment unique,
    cd_navio int(10) not null,
    dt_saida_navio datetime not null,
    PRIMARY KEY (`cd_transporte_navio`),
    FOREIGN KEY (`cd_navio`) REFERENCES `TB_NAVIO` (`cd_navio`)
);
create table TB_TRANSPORTADORA(
	cd_transportadora int(10) not null auto_increment unique,
    nm_transportadora varchar(100) not null,
    cd_cnpj_transportadora varchar(14) not null,
    PRIMARY KEY (`cd_transportadora`)
);
create table TB_TRANSPORTE(
	cd_transporte int(10) not null auto_increment unique,
    cd_transportadora int(10) not null,
    cd_placa_transporte varchar(9) not null,
    qt_peso_transporte decimal(8,2) not null,
	ic_rodoviario_ferroviario enum('R','F') not null,
    PRIMARY KEY (`cd_transporte`),
    FOREIGN KEY (`cd_transportadora`) REFERENCES `TB_TRANSPORTADORA` (`cd_transportadora`)
);
create table TB_CARGA(
	cd_carga int(10) not null auto_increment unique,
    cd_produto int(10) not null,
    cd_armazem int(10),
    cd_transporte int(10),
    qt_produto decimal(8,2) not null,
    qt_peso_carga decimal(8,2) not null,
    vl_carga decimal(9,2) not null,
    PRIMARY KEY (`cd_carga`),
    FOREIGN KEY (`cd_produto`) REFERENCES `TB_PRODUTO` (`cd_produto`),
    FOREIGN KEY (`cd_armazem`) REFERENCES `TB_ARMAZEM` (`cd_armazem`),
    FOREIGN KEY (`cd_transporte`) REFERENCES `TB_TRANSPORTE` (`cd_transporte`)
);
create table TB_PEDIDO(
	cd_pedido int(10) not null auto_increment unique,
    cd_carga int(10) not null,
	cd_transporte_navio int(10),
    qt_produto_pedido decimal(8,2) not null,
    qt_peso_pedido decimal(8,2) not null,
    vl_pedido decimal(9,2) not null,
	PRIMARY KEY (`cd_pedido`),
	FOREIGN KEY (`cd_carga`) REFERENCES `TB_CARGA` (`cd_carga`),
	FOREIGN KEY (`cd_transporte_navio`) REFERENCES `TB_TRANSPORTE_NAVIO` (`cd_transporte_navio`)
);
create table TB_NOTA_FISCAL(
	cd_nota_fiscal int(10) not null auto_increment unique,
    cd_pedido int(10) not null,
    cd_chave_acesso_nf char(44) not null,
    vl_nota_fiscal decimal(8,2) not null,
    nm_empresa_nf VARCHAR(100) not null,
    cd_cnpj_empresa_nf varchar(14) not null,
    sg_estado_empresa_nf VARCHAR(2) not null,
	nm_cidade_empresa_nf VARCHAR(50) not null,
	nm_endereco_empresa_nf VARCHAR(100) not null,
	cd_endereco_empresa_nf int(5) not null,
    id_produto_nf int(10) not null,
    nm_produto_nf varchar(100) not null,
    ds_produto_nf varchar (200) not null,
    nm_porto_nf varchar(100) not null,
    sg_estado_porto_nf varchar(2) not null,
    nm_cidade_porto_nf VARCHAR(50) not null,
	nm_endereco_porto_nf VARCHAR(100) not null,
	cd_endereco_porto_nf int(5) not null,
    nm_armazem_nf varchar(100) not null,
    nm_navio_nf varchar(100) not null,
    ds_navio_nf varchar(200),
    dt_saida_navio_nf datetime not null,
    qt_produto_pedido_nf decimal(8,2) not null,
    qt_peso_pedido_nf decimal(8,2) not null,
    vl_pedido_nf decimal(9,2) not null,
    PRIMARY KEY (`cd_nota_fiscal`),
	FOREIGN KEY (`cd_pedido`) REFERENCES `TB_PEDIDO` (`cd_pedido`)
);