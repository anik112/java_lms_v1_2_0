/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.dao;

import java.util.List;
import lms_V1.pkg2.pkg0.domain.Publisher;

/**
 *
 * @author anik
 */
public interface PublisherDao {

    /**
     * <savePublisher(Publisher publisher)/> this method save all publisher
     * information,
     * <deletePublisher(int id)/> this method delete publisher information,
     * <List<Publisher> getPublisherList()/> this method return publisher list,
     *
     * @param publisher
     */
    public void savePublisher(Publisher publisher);

    public void deletePublisher(int id);

    public List<Publisher> getPublisherList();

}
