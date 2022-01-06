package business.custom.impl;

import business.custom.StudentBO;
import dao.DAOFactory;
import dao.DAOType;
import dao.custom.impl.StudentDAOImpl;
import dto.StudentDTO;
import entity.Students;

import java.util.ArrayList;
import java.util.List;

public class StudentBOImpl implements StudentBO {

   StudentDAOImpl studentDAO = DAOFactory.getInstance().getDAO(DAOType.STUDENT);


    @Override
    public boolean add(StudentDTO studentDTO) throws Exception {
        return studentDAO.add(new Students(
                studentDTO.getId(),
                studentDTO.getName(),
                studentDTO.getNIC(),
                studentDTO.getContact(),
                studentDTO.getEmail(),
                studentDTO.getAddress()
        ));
    }



    @Override
    public List<StudentDTO> findAll() throws Exception {
        List<Students> all = studentDAO.findAll();
        ArrayList<StudentDTO> dtoArrayList = new ArrayList<>();



        for (Students students : all) {
            dtoArrayList.add(new StudentDTO(
                    students.getId(),
                    students.getName(),
                    students.getNIC(),
                    students.getContact(),
                    students.getEmail(),
                    students.getAddress()

            ));
        }
       return dtoArrayList;
    }

    @Override
    public boolean delete(String id) throws Exception {
        return  studentDAO.delete(id);
    }

    @Override
    public boolean update(StudentDTO studentDTO) throws Exception {
        return studentDAO.update(new Students(
           studentDTO.getId(),
           studentDTO.getName(),
           studentDTO.getNIC(),
           studentDTO.getContact(),
           studentDTO.getEmail(),
           studentDTO.getAddress()
        ));
    }
}
