package ntt.global;

import org.springframework.beans.factory.annotation.Autowired;

public class Coach implements ICoach
{
    protected String email;
    protected String team;

    @Override
    public String getDailyWorkout()
    {
        return null;
    }

    @Override
    public String getDailyFortune()
    {
        return null;
    }

    public String getEmail()
    {
        return email;
    }

    public String getTeam()
    {
        return team;
    }

    @Autowired
    public void setEmail(String email)
    {
        this.email = email;
    }

    @Autowired
    public void setTeam(String team)
    {
        this.team = team;
    }


}
