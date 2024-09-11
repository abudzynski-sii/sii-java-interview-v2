package pl.sii.interview;

import org.junit.jupiter.api.Test;
import pl.sii.interview.model.InterviewItem;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptyMap;
import static org.assertj.core.api.Assertions.assertThat;

 /**
 * Do not change the test expectations and do not modify interviewItemsArray.
 */
class InterviewTest {
    final InterviewItem[] interviewItemsArray = new InterviewItem[]{
            InterviewItem.builder().question("Abc ?").answer("Xyz").build(),
            InterviewItem.builder().question("Abc ?").answer("Good").build(),
            InterviewItem.builder().question("Abc ?").answer("Good").build(),
            InterviewItem.builder().question("Abc ??").answer("Maybe C?").build(),
            InterviewItem.builder().question("Abc ?").answer(null).build(),
            InterviewItem.builder().question("Is this real?").answer("Maybe Yes").build(),
            InterviewItem.builder().question("Is this real?").answer("Maybe No").build(),
    };

    @Test
    void arrayItems_filtering() {
        List<InterviewItem> resultList = emptyList();

        /* TODO create a list containing all InterviewItem objects from the interviewItemsArray, for which:
           - the answer property contains 'y' character
           - the question property ends with a single '?' character
        */

        assertThat(resultList).hasSize(3);
        assertThat(resultList).contains(InterviewItem.builder().question("Abc ?").answer("Xyz").build());
        assertThat(resultList).contains(InterviewItem.builder().question("Is this real?").answer("Maybe Yes").build());
        assertThat(resultList).contains(InterviewItem.builder().question("Is this real?").answer("Maybe No").build());
    }

    @Test
    void arrayItems_toMap_uniqueEntries() {
        Map<String, Collection<String>> resultMap = emptyMap();

        /* TODO from the interviewItemsArray create a map {key: question, value: [answer1, answer2]}:
           - questions should be unique
           - answers to the questions should be unique
        */

        assertThat(resultMap).hasSize(3);
        assertThat(resultMap).containsKeys("Abc ?", "Abc ??", "Is this real?");
        assertThat(resultMap.get("Abc ?"))
                .hasSize(3)
                .contains("Xyz", "Good", null);
        assertThat(resultMap.get("Abc ??"))
                .hasSize(1)
                .contains("Maybe C?");
        assertThat(resultMap.get("Is this real?"))
                .hasSize(2)
                .contains("Maybe Yes", "Maybe No");
    }

}

