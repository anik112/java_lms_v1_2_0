/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.dao;

import java.util.List;
import lms_V1.pkg2.pkg0.domain.Edition;

/**
 *
 * @author anik
 */
public interface EditionDao {

    /**
     * <saveEdition(Edition edition)/> this method save all Edition information,
     * <deleteEdition(int id)/> this method delete Edition information,
     * <List<Edition> getEditionList()/> this method return Edition list,
     *
     * @param edition
     */
    public void saveEdition(Edition edition);

    public void deleteEdition(int id);

    public List<Edition> getEditionList();

}
