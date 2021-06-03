package ro.ase.cts.classes;

import java.util.ArrayList;
import java.util.List;

//O grupa contine maxim 35 de studenti
//nr grupei pt facultate este cuprins intre 1000-1100

public class Grupa {
    private List<IStudent> studenti;
    private int nrGrupa;

    public Grupa(int nrGrupa){
    	if(nrGrupa<1000 || nrGrupa>1100)
    		throw new IndexOutOfBoundsException();
    	else
    	{
    		this.nrGrupa=nrGrupa;
            studenti=new ArrayList<>();
    	}
    }
    

    public int getNrGrupa() {
		return nrGrupa;
	}
    
    public List<IStudent> getStudenti()
    {
    	return this.studenti;
    }

	public void importaStudenti(List<IStudent> studenti){
        this.studenti.addAll(studenti);
    }

    public void adaugaStudent(IStudent student){
        studenti.add(student);
    }

    public IStudent getStudent(int index){
        if(index>=0 && index< studenti.size()){
            return studenti.get(index);
        }
        throw new IndexOutOfBoundsException();
    }

    public float getPromovabilitate(){
    	
    	if(this.studenti.size()==0)
    		return 0;
        float nrIntegralisti=0;
        for(IStudent student:studenti){
            if(!student.areRestante()){
                nrIntegralisti++;
            }
        }
        return nrIntegralisti/studenti.size();
    }
    
    
}
