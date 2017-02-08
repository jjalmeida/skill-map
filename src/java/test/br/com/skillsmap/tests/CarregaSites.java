package br.com.skillsmap.tests;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import br.com.skillmap.dao.DAO;
import br.com.skillmap.entity.Site;

public class CarregaSites {

	public void insereSites() {
		String csvFileToRead = "/Producao/sites.txt";

		BufferedReader br = null;
		String linha = "";

		try {

			br = new BufferedReader(new FileReader(csvFileToRead));
			br.readLine();
			while ((linha = br.readLine()) != null) {

				Site site = new Site();
				site.setDescricao(linha);
				new DAO<Site>(Site.class).adiciona(site);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		CarregaSites cs = new CarregaSites();
		cs.insereSites();
	}

}
