package lesscau.pet.multiplygame.challenge;

import lesscau.pet.multiplygame.user.User;
import org.springframework.stereotype.Service;

@Service
public class ChallengeServiceImpl implements ChallengeService {
    @Override
    public ChallengeAttempt verifyAttempt(ChallengeAttemptDTO resultAttempt) {
        int result = resultAttempt.getFactorA() * resultAttempt.getFactorB();
        boolean isCorrect = resultAttempt.getGuess() == result;

        User user = new User(0, resultAttempt.getUserAlias());

        return new ChallengeAttempt(0L, user, resultAttempt.getFactorA(), resultAttempt.getFactorB(), result, isCorrect);
    }
}
