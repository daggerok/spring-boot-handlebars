package com.daggerok.domain;

import lombok.*;

@ToString
@EqualsAndHashCode
@RequiredArgsConstructor(staticName = "of")
public class File {
    @NonNull @Getter String filename;
}