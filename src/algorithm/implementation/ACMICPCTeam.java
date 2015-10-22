package algorithm.implementation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @version $Revision$
 * @version $Date$
 * @author $Author$
 * @owner Sandro Mario Zbinden
 */
public class ACMICPCTeam {
    public static class Solution {

        public static void printBestTeams(List<BigInteger> memberSkills) {
            Set<Team> bestTeams = new HashSet<>();
            int bestScore = 0;
            for (int i = 0; i < memberSkills.size(); i++) {
                for (int j = i + 1; j < memberSkills.size(); j++) {
                    TeamMember teamMember1 = new TeamMember(i + 1, memberSkills.get(i));
                    TeamMember teamMember2 = new TeamMember(j + 1, memberSkills.get(j));
                    Team team = new Team(teamMember1, teamMember2);
                    int teamScore = team.getTeamScore();
                    if (teamScore > bestScore) {
                        bestTeams.clear();
                        bestTeams.add(team);
                        bestScore = teamScore;
                    } else if (teamScore == bestScore) {
                        bestTeams.add(team);
                    }
                }
            }
            System.out.println(bestScore);
            System.out.println(bestTeams.size());
        }

        public static class Team {

            private TeamMember teamMember1;
            private TeamMember teamMember2;

            public Team(TeamMember teamMember1, TeamMember teamMember2) {
                this.teamMember1 = teamMember1;
                this.teamMember2 = teamMember2;
            }

            public int getTeamScore() {
                return teamMember1.skill.or(teamMember2.skill).bitCount();
            }

            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + ((teamMember1 == null) ? 0 : teamMember1.hashCode());
                result = prime * result + ((teamMember2 == null) ? 0 : teamMember2.hashCode());
                return result;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null) {
                    return false;
                }
                if (getClass() != obj.getClass()) {
                    return false;
                }
                Team other = (Team) obj;
                if (teamMember1 == null) {
                    if (other.teamMember1 != null) {
                        return false;
                    }
                } else if (!teamMember1.equals(other.teamMember1)) {
                    return false;
                }
                if (teamMember2 == null) {
                    if (other.teamMember2 != null) {
                        return false;
                    }
                } else if (!teamMember2.equals(other.teamMember2)) {
                    return false;
                }
                return true;
            }
        }

        public static class TeamMember {
            private int name;
            private BigInteger skill;

            public TeamMember(int name, BigInteger skill) {
                this.name = name;
                this.skill = skill;
            }

            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + name;
                result = prime * result + ((skill == null) ? 0 : skill.hashCode());
                return result;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null) {
                    return false;
                }
                if (getClass() != obj.getClass()) {
                    return false;
                }
                TeamMember other = (TeamMember) obj;
                if (name != other.name) {
                    return false;
                }
                if (skill == null) {
                    if (other.skill != null) {
                        return false;
                    }
                } else if (!skill.equals(other.skill)) {
                    return false;
                }
                return true;
            }
        }

        public static void main(String[] args) {
            try (Scanner in = new Scanner(System.in)) {
                int n = in.nextInt();
                int m = in.nextInt();
                List<BigInteger> memberSkills = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    memberSkills.add(new BigInteger(in.next(), 2));
                }
                printBestTeams(memberSkills);
            }
        }
    }

    public static void main(String[] args) {
        Solution.main(null);
    }
}
