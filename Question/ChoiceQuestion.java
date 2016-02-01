

public class ChoiceQuestion extends Question
{
    private int numberOfChoices;
    
    public ChoiceQuestion()
    {
        super();
        this.numberOfChoices = 0;
    }
    
    public void addChoice(String choice, boolean correct)
    {
        this.numberOfChoices++;
        // for example, "1) the text of the first choice"
        this.addText("/n" + numberOfChoices + ") " + choice);
        
        if (correct == true)
        {
            String choiceString = "" + numberOfChoices;
            this.setAnswer(choiceString);
        }
    }
}