.class Lhj/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhj/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lhj/h<",
        "TV;>;"
    }
.end annotation


# static fields
.field private static final y:[I


# instance fields
.field private final k:Lfj/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfj/p<",
            "TV;>;"
        }
    .end annotation
.end field

.field private final l:Z

.field private final m:I

.field private final n:I

.field private final o:Lhj/x;

.field private final p:Z

.field private final q:Z

.field private final r:Lgj/g;

.field private final s:I

.field private final t:C

.field private final u:Lgj/j;

.field private final v:I

.field private final w:I

.field private final x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, Lhj/r;->y:[I

    .line 9
    .line 10
    return-void

    .line 11
    :array_0
    .array-data 4
        0x9
        0x63
        0x3e7
        0x270f
        0x1869f
        0xf423f
        0x98967f
        0x5f5e0ff
        0x3b9ac9ff
        0x7fffffff
    .end array-data
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method constructor <init>(Lfj/p;ZIILhj/x;Z)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "TV;>;ZII",
            "Lhj/x;",
            "Z)V"
        }
    .end annotation

    const/4 v7, 0x0

    const/16 v8, 0x30

    .line 1
    sget-object v9, Lgj/j;->k:Lgj/j;

    sget-object v10, Lgj/g;->l:Lgj/g;

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v12}, Lhj/r;-><init>(Lfj/p;ZIILhj/x;ZICLgj/j;Lgj/g;IZ)V

    return-void
.end method

.method private constructor <init>(Lfj/p;ZIILhj/x;ZICLgj/j;Lgj/g;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "TV;>;ZII",
            "Lhj/x;",
            "ZIC",
            "Lgj/j;",
            "Lgj/g;",
            "IZ)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lhj/r;->k:Lfj/p;

    .line 4
    iput-boolean p2, p0, Lhj/r;->l:Z

    .line 5
    iput p3, p0, Lhj/r;->m:I

    .line 6
    iput p4, p0, Lhj/r;->n:I

    .line 7
    iput-object p5, p0, Lhj/r;->o:Lhj/x;

    .line 8
    iput-boolean p6, p0, Lhj/r;->p:Z

    .line 9
    iput-boolean p12, p0, Lhj/r;->x:Z

    if-eqz p1, :cond_a

    if-eqz p5, :cond_9

    const/4 p6, 0x1

    if-lt p3, p6, :cond_8

    if-gt p3, p4, :cond_7

    if-eqz p2, :cond_1

    if-ne p3, p4, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Variable width in fixed-width-mode: "

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " != "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p2, :cond_3

    .line 11
    sget-object p2, Lhj/x;->k:Lhj/x;

    if-ne p5, p2, :cond_2

    goto :goto_1

    .line 12
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Sign policy must be SHOW_NEVER in fixed-width-mode."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 13
    :cond_3
    :goto_1
    invoke-direct {p0, p9}, Lhj/r;->b(Lgj/j;)I

    move-result p2

    .line 14
    invoke-virtual {p9}, Lgj/j;->n()Z

    move-result p5

    if-eqz p5, :cond_6

    if-gt p3, p2, :cond_5

    if-gt p4, p2, :cond_4

    goto :goto_2

    .line 15
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Max digits out of range: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 16
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Min digits out of range: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 17
    :cond_6
    :goto_2
    invoke-interface {p1}, Lfj/p;->name()Ljava/lang/String;

    move-result-object p1

    const-string p3, "YEAR_OF_ERA"

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Lhj/r;->q:Z

    .line 18
    iput p7, p0, Lhj/r;->s:I

    .line 19
    iput-char p8, p0, Lhj/r;->t:C

    .line 20
    iput-object p9, p0, Lhj/r;->u:Lgj/j;

    .line 21
    iput-object p10, p0, Lhj/r;->r:Lgj/g;

    .line 22
    iput p11, p0, Lhj/r;->v:I

    .line 23
    iput p2, p0, Lhj/r;->w:I

    return-void

    .line 24
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Max smaller than min: "

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, " < "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 25
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "Not positive: "

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 26
    :cond_9
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing sign policy."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 27
    :cond_a
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "Missing element."

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static a(ILjava/lang/Appendable;C)V
    .locals 3

    .line 1
    mul-int/lit8 v0, p0, 0x67

    .line 2
    .line 3
    ushr-int/lit8 v0, v0, 0xa

    .line 4
    .line 5
    shl-int/lit8 v1, v0, 0x3

    .line 6
    .line 7
    shl-int/lit8 v2, v0, 0x1

    .line 8
    .line 9
    add-int/2addr v1, v2

    .line 10
    sub-int/2addr p0, v1

    .line 11
    add-int/2addr v0, p2

    .line 12
    int-to-char v0, v0

    .line 13
    invoke-interface {p1, v0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 14
    .line 15
    .line 16
    add-int/2addr p0, p2

    .line 17
    int-to-char p0, p0

    .line 18
    invoke-interface {p1, p0}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 19
    .line 20
    .line 21
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
.end method

.method private b(Lgj/j;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Lgj/j;->n()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    iget-object p1, p0, Lhj/r;->k:Lfj/p;

    .line 8
    .line 9
    invoke-interface {p1}, Lfj/p;->getType()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-class v0, Ljava/lang/Integer;

    .line 14
    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    const/16 p1, 0xa

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    const-class v0, Ljava/lang/Long;

    .line 21
    .line 22
    if-ne p1, v0, :cond_1

    .line 23
    .line 24
    const/16 p1, 0x12

    .line 25
    .line 26
    return p1

    .line 27
    :cond_1
    const/16 p1, 0x9

    .line 28
    .line 29
    return p1

    .line 30
    :cond_2
    const/16 p1, 0x64

    .line 31
    .line 32
    return p1
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method private static d(I)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lhj/r;->y:[I

    aget v1, v1, v0

    if-gt p0, v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method public c()Lfj/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lfj/p<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lhj/r;->k:Lfj/p;

    return-object v0
.end method

.method public e(Lfj/o;Ljava/lang/Appendable;Lfj/d;Ljava/util/Set;Z)I
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/o;",
            "Ljava/lang/Appendable;",
            "Lfj/d;",
            "Ljava/util/Set<",
            "Lhj/g;",
            ">;Z)I"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v9, p2

    move-object/from16 v4, p3

    move-object/from16 v10, p4

    .line 1
    instance-of v1, v9, Ljava/lang/CharSequence;

    const/4 v11, -0x1

    if-eqz v1, :cond_0

    move-object v1, v9

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    move v12, v1

    goto :goto_0

    :cond_0
    move v12, v11

    :goto_0
    const/4 v3, 0x0

    if-eqz p5, :cond_1

    .line 2
    iget-object v5, v0, Lhj/r;->u:Lgj/j;

    .line 3
    iget-char v6, v0, Lhj/r;->t:C

    goto :goto_1

    .line 4
    :cond_1
    sget-object v5, Lgj/a;->l:Lfj/c;

    sget-object v6, Lgj/j;->k:Lgj/j;

    invoke-interface {v4, v5, v6}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lgj/j;

    .line 5
    sget-object v6, Lgj/a;->m:Lfj/c;

    .line 6
    invoke-interface {v4, v6}, Lfj/d;->b(Lfj/c;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 7
    invoke-interface {v4, v6}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Character;

    invoke-virtual {v6}, Ljava/lang/Character;->charValue()C

    move-result v6

    goto :goto_1

    .line 8
    :cond_2
    invoke-virtual {v5}, Lgj/j;->n()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v5}, Lgj/j;->l()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    goto :goto_1

    :cond_3
    const/16 v6, 0x30

    :goto_1
    const-string v8, "Negative value not allowed according to sign policy."

    const-string v13, "."

    const-string v14, " exceeds the maximum width of "

    const-string v15, " cannot be printed as the formatted value "

    const-string v3, "Element "

    const/high16 v7, -0x80000000

    if-eqz p5, :cond_c

    .line 9
    iget-boolean v1, v0, Lhj/r;->x:Z

    if-eqz v1, :cond_c

    .line 10
    iget-object v1, v0, Lhj/r;->k:Lfj/p;

    invoke-interface {v2, v1}, Lfj/o;->m(Lfj/p;)I

    move-result v1

    if-gez v1, :cond_5

    if-ne v1, v7, :cond_4

    return v11

    .line 11
    :cond_4
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 12
    :cond_5
    invoke-static {v1}, Lhj/r;->d(I)I

    move-result v2

    .line 13
    iget v4, v0, Lhj/r;->n:I

    if-gt v2, v4, :cond_b

    .line 14
    iget v3, v0, Lhj/r;->m:I

    sub-int/2addr v3, v2

    const/4 v4, 0x0

    const/16 v16, 0x0

    :goto_2
    if-ge v4, v3, :cond_6

    const/16 v5, 0x30

    .line 15
    invoke-interface {v9, v5}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    add-int/lit8 v16, v16, 0x1

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_6
    const/4 v4, 0x2

    const/16 v5, 0x30

    if-ne v2, v4, :cond_7

    .line 16
    invoke-static {v1, v9, v5}, Lhj/r;->a(ILjava/lang/Appendable;C)V

    goto :goto_3

    :cond_7
    const/4 v3, 0x1

    if-ne v2, v3, :cond_8

    add-int/2addr v1, v5

    int-to-char v1, v1

    .line 17
    invoke-interface {v9, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_3

    :cond_8
    const/16 v3, 0x7d0

    if-lt v1, v3, :cond_9

    const/16 v4, 0x834

    if-ge v1, v4, :cond_9

    const/16 v4, 0x32

    .line 18
    invoke-interface {v9, v4}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 19
    invoke-interface {v9, v5}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    sub-int/2addr v1, v3

    .line 20
    invoke-static {v1, v9, v5}, Lhj/r;->a(ILjava/lang/Appendable;C)V

    goto :goto_3

    :cond_9
    const/16 v4, 0x76c

    if-lt v1, v4, :cond_a

    if-ge v1, v3, :cond_a

    const/16 v3, 0x31

    .line 21
    invoke-interface {v9, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    const/16 v3, 0x39

    .line 22
    invoke-interface {v9, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    sub-int/2addr v1, v4

    .line 23
    invoke-static {v1, v9, v5}, Lhj/r;->a(ILjava/lang/Appendable;C)V

    goto :goto_3

    .line 24
    :cond_a
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :goto_3
    add-int v16, v16, v2

    move v1, v11

    move v11, v12

    goto/16 :goto_11

    .line 25
    :cond_b
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lhj/r;->k:Lfj/p;

    .line 26
    invoke-interface {v3}, Lfj/p;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v0, Lhj/r;->n:I

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 27
    :cond_c
    iget-boolean v1, v0, Lhj/r;->q:Z

    if-eqz v1, :cond_d

    iget-object v1, v0, Lhj/r;->k:Lfj/p;

    instance-of v11, v1, Lij/a;

    if-eqz v11, :cond_d

    .line 28
    const-class v3, Lij/a;

    invoke-virtual {v3, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lij/a;

    .line 29
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    iget v7, v0, Lhj/r;->m:I

    iget v8, v0, Lhj/r;->n:I

    move-object/from16 v2, p1

    move-object v3, v11

    move-object/from16 v4, p3

    invoke-interface/range {v1 .. v8}, Lij/a;->I(Lfj/o;Ljava/lang/Appendable;Lfj/d;Lgj/j;CII)V

    .line 31
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 32
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->length()I

    move-result v16

    move v11, v12

    :goto_4
    const/4 v1, -0x1

    goto/16 :goto_11

    .line 33
    :cond_d
    invoke-virtual {v5}, Lgj/j;->l()Ljava/lang/String;

    move-result-object v1

    const/4 v11, 0x0

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 34
    iget-object v11, v0, Lhj/r;->k:Lfj/p;

    invoke-interface {v11}, Lfj/p;->getType()Ljava/lang/Class;

    move-result-object v11

    .line 35
    invoke-virtual {v5}, Lgj/j;->n()Z

    move-result v18

    .line 36
    const-class v7, Ljava/lang/Integer;

    const/16 v19, 0x0

    if-ne v11, v7, :cond_10

    .line 37
    iget-object v4, v0, Lhj/r;->k:Lfj/p;

    invoke-interface {v2, v4}, Lfj/o;->m(Lfj/p;)I

    move-result v2

    const/high16 v4, -0x80000000

    if-ne v2, v4, :cond_e

    const/4 v4, -0x1

    return v4

    :cond_e
    if-gez v2, :cond_f

    const/4 v4, 0x1

    goto :goto_5

    :cond_f
    const/4 v4, 0x0

    .line 38
    :goto_5
    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v7

    .line 39
    invoke-static {v7}, Lhj/r;->d(I)I

    move-result v2

    goto/16 :goto_9

    .line 40
    :cond_10
    const-class v7, Ljava/lang/Long;

    if-ne v11, v7, :cond_13

    .line 41
    iget-object v1, v0, Lhj/r;->k:Lfj/p;

    invoke-interface {v2, v1}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object v1

    .line 42
    invoke-virtual {v7, v1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v19, 0x0

    cmp-long v4, v1, v19

    if-gez v4, :cond_11

    const/4 v4, 0x1

    goto :goto_6

    :cond_11
    const/4 v4, 0x0

    :goto_6
    const-wide/high16 v19, -0x8000000000000000L

    cmp-long v7, v1, v19

    if-nez v7, :cond_12

    const-string v1, "9223372036854775808"

    goto :goto_7

    .line 43
    :cond_12
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    :goto_7
    move-object/from16 v19, v1

    .line 44
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v1, 0x30

    const/high16 v7, -0x80000000

    goto :goto_9

    .line 45
    :cond_13
    const-class v7, Ljava/lang/Enum;

    invoke-virtual {v7, v11}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_2b

    .line 46
    iget-object v7, v0, Lhj/r;->k:Lfj/p;

    instance-of v11, v7, Lgj/l;

    if-eqz v11, :cond_15

    .line 47
    invoke-interface {v2, v7}, Lfj/o;->k(Lfj/p;)Ljava/lang/Object;

    move-result-object v7

    .line 48
    iget-object v11, v0, Lhj/r;->k:Lfj/p;

    check-cast v11, Lgj/l;

    invoke-interface {v11, v7, v2, v4}, Lgj/l;->H(Ljava/lang/Object;Lfj/o;Lfj/d;)I

    move-result v4

    if-gez v4, :cond_14

    const/4 v2, 0x1

    goto :goto_8

    :cond_14
    const/4 v2, 0x0

    goto :goto_8

    :cond_15
    const/4 v2, 0x0

    const/high16 v4, -0x80000000

    :goto_8
    const/high16 v7, -0x80000000

    if-eq v4, v7, :cond_2a

    .line 49
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v7

    .line 50
    invoke-static {v7}, Lhj/r;->d(I)I

    move-result v4

    move/from16 v21, v4

    move v4, v2

    move/from16 v2, v21

    :goto_9
    if-eqz v18, :cond_1a

    if-eq v6, v1, :cond_18

    sub-int v1, v6, v1

    if-nez v19, :cond_16

    .line 51
    invoke-virtual {v5, v7}, Lgj/j;->r(I)Ljava/lang/String;

    move-result-object v19

    .line 52
    :cond_16
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->toCharArray()[C

    move-result-object v11

    move/from16 v17, v12

    const/4 v10, 0x0

    .line 53
    :goto_a
    array-length v12, v11

    if-ge v10, v12, :cond_17

    .line 54
    aget-char v12, v11, v10

    add-int/2addr v12, v1

    int-to-char v12, v12

    aput-char v12, v11, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_a

    .line 55
    :cond_17
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v11}, Ljava/lang/String;-><init>([C)V

    move-object/from16 v19, v1

    goto :goto_b

    :cond_18
    move/from16 v17, v12

    .line 56
    :goto_b
    iget v1, v0, Lhj/r;->n:I

    if-le v2, v1, :cond_1b

    if-nez v19, :cond_19

    .line 57
    invoke-virtual {v5, v7}, Lgj/j;->r(I)Ljava/lang/String;

    move-result-object v19

    :cond_19
    move-object/from16 v1, v19

    .line 58
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lhj/r;->k:Lfj/p;

    .line 59
    invoke-interface {v3}, Lfj/p;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v0, Lhj/r;->n:I

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1a
    move/from16 v17, v12

    :cond_1b
    move-object/from16 v1, v19

    if-eqz v4, :cond_1d

    .line 60
    iget-object v3, v0, Lhj/r;->o:Lhj/x;

    sget-object v4, Lhj/x;->k:Lhj/x;

    if-eq v3, v4, :cond_1c

    const/16 v3, 0x2d

    .line 61
    invoke-interface {v9, v3}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_d

    .line 62
    :cond_1c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 63
    :cond_1d
    sget-object v3, Lhj/r$a;->a:[I

    iget-object v4, v0, Lhj/r;->o:Lhj/x;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/16 v4, 0x2b

    const/4 v8, 0x1

    if-eq v3, v8, :cond_20

    const/4 v8, 0x2

    if-eq v3, v8, :cond_1e

    goto :goto_c

    :cond_1e
    if-eqz v18, :cond_1f

    .line 64
    iget v3, v0, Lhj/r;->m:I

    if-le v2, v3, :cond_1f

    .line 65
    invoke-interface {v9, v4}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_d

    :cond_1f
    :goto_c
    const/4 v3, 0x0

    goto :goto_e

    .line 66
    :cond_20
    invoke-interface {v9, v4}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    :goto_d
    const/4 v3, 0x1

    :goto_e
    if-eqz v18, :cond_22

    .line 67
    iget v4, v0, Lhj/r;->m:I

    sub-int/2addr v4, v2

    move v8, v3

    const/4 v3, 0x0

    :goto_f
    if-ge v3, v4, :cond_21

    .line 68
    invoke-interface {v9, v6}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_21
    move v3, v8

    :cond_22
    if-nez v1, :cond_28

    if-eqz v18, :cond_27

    const/4 v1, 0x2

    if-ne v2, v1, :cond_23

    .line 69
    invoke-static {v7, v9, v6}, Lhj/r;->a(ILjava/lang/Appendable;C)V

    goto :goto_10

    :cond_23
    const/4 v1, 0x1

    if-ne v2, v1, :cond_24

    add-int/2addr v7, v6

    int-to-char v1, v7

    .line 70
    invoke-interface {v9, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    goto :goto_10

    :cond_24
    const/16 v1, 0x7d0

    if-lt v7, v1, :cond_25

    const/16 v4, 0x834

    if-ge v7, v4, :cond_25

    add-int/lit8 v4, v6, 0x2

    int-to-char v4, v4

    .line 71
    invoke-interface {v9, v4}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    .line 72
    invoke-interface {v9, v6}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    sub-int/2addr v7, v1

    .line 73
    invoke-static {v7, v9, v6}, Lhj/r;->a(ILjava/lang/Appendable;C)V

    goto :goto_10

    :cond_25
    const/16 v4, 0x76c

    if-lt v7, v4, :cond_26

    if-ge v7, v1, :cond_26

    add-int/lit8 v1, v6, 0x1

    int-to-char v1, v1

    .line 74
    invoke-interface {v9, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    add-int/lit8 v1, v6, 0x9

    int-to-char v1, v1

    .line 75
    invoke-interface {v9, v1}, Ljava/lang/Appendable;->append(C)Ljava/lang/Appendable;

    sub-int/2addr v7, v4

    .line 76
    invoke-static {v7, v9, v6}, Lhj/r;->a(ILjava/lang/Appendable;C)V

    goto :goto_10

    .line 77
    :cond_26
    invoke-virtual {v5, v7}, Lgj/j;->r(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v9, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_10

    .line 78
    :cond_27
    invoke-virtual {v5, v7, v9}, Lgj/j;->q(ILjava/lang/Appendable;)I

    move-result v2

    goto :goto_10

    .line 79
    :cond_28
    invoke-interface {v9, v1}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 80
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    :goto_10
    add-int v16, v3, v2

    move/from16 v11, v17

    goto/16 :goto_4

    :goto_11
    if-eq v11, v1, :cond_29

    if-lez v16, :cond_29

    move-object/from16 v1, p4

    if-eqz v1, :cond_29

    .line 81
    new-instance v2, Lhj/g;

    iget-object v3, v0, Lhj/r;->k:Lfj/p;

    add-int v12, v11, v16

    invoke-direct {v2, v3, v11, v12}, Lhj/g;-><init>(Lfj/p;II)V

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_29
    return v16

    .line 82
    :cond_2a
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot print: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lhj/r;->k:Lfj/p;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 83
    :cond_2b
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Not formattable: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lhj/r;->k:Lfj/p;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lhj/r;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_2

    .line 9
    .line 10
    check-cast p1, Lhj/r;

    .line 11
    .line 12
    iget-object v1, p0, Lhj/r;->k:Lfj/p;

    .line 13
    .line 14
    iget-object v3, p1, Lhj/r;->k:Lfj/p;

    .line 15
    .line 16
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-boolean v1, p0, Lhj/r;->l:Z

    .line 23
    .line 24
    iget-boolean v3, p1, Lhj/r;->l:Z

    .line 25
    .line 26
    if-ne v1, v3, :cond_1

    .line 27
    .line 28
    iget v1, p0, Lhj/r;->m:I

    .line 29
    .line 30
    iget v3, p1, Lhj/r;->m:I

    .line 31
    .line 32
    if-ne v1, v3, :cond_1

    .line 33
    .line 34
    iget v1, p0, Lhj/r;->n:I

    .line 35
    .line 36
    iget v3, p1, Lhj/r;->n:I

    .line 37
    .line 38
    if-ne v1, v3, :cond_1

    .line 39
    .line 40
    iget-object v1, p0, Lhj/r;->o:Lhj/x;

    .line 41
    .line 42
    iget-object v3, p1, Lhj/r;->o:Lhj/x;

    .line 43
    .line 44
    if-ne v1, v3, :cond_1

    .line 45
    .line 46
    iget-boolean v1, p0, Lhj/r;->p:Z

    .line 47
    .line 48
    iget-boolean p1, p1, Lhj/r;->p:Z

    .line 49
    .line 50
    if-ne v1, p1, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    move v0, v2

    .line 54
    :goto_0
    return v0

    .line 55
    :cond_2
    return v2
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method

.method public f(Lfj/p;)Lhj/h;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj/p<",
            "TV;>;)",
            "Lhj/h<",
            "TV;>;"
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lhj/r;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lhj/r;->k:Lfj/p;

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Lhj/r;

    .line 11
    .line 12
    iget-boolean v3, p0, Lhj/r;->l:Z

    .line 13
    .line 14
    iget v4, p0, Lhj/r;->m:I

    .line 15
    .line 16
    iget v5, p0, Lhj/r;->n:I

    .line 17
    .line 18
    iget-object v6, p0, Lhj/r;->o:Lhj/x;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    move-object v1, v0

    .line 22
    move-object v2, p1

    .line 23
    invoke-direct/range {v1 .. v7}, Lhj/r;-><init>(Lfj/p;ZIILhj/x;Z)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_1
    :goto_0
    return-object p0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lhj/r;->k:Lfj/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x7

    .line 8
    .line 9
    iget v1, p0, Lhj/r;->m:I

    .line 10
    .line 11
    iget v2, p0, Lhj/r;->n:I

    .line 12
    .line 13
    mul-int/lit8 v2, v2, 0xa

    .line 14
    .line 15
    add-int/2addr v1, v2

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    return v0
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public i(Ljava/lang/CharSequence;Lhj/s;Lfj/d;Lhj/t;Z)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/CharSequence;",
            "Lhj/s;",
            "Lfj/d;",
            "Lhj/t<",
            "*>;Z)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    .line 1
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    .line 2
    invoke-virtual/range {p2 .. p2}, Lhj/s;->f()I

    move-result v6

    const-string v7, "Digit expected."

    const-string v8, "Not enough digits found for: "

    const-string v11, "Parsed number does not fit into an integer: "

    const/16 v12, 0x30

    const-string v15, "Sign not allowed due to sign policy."

    const-wide/16 v16, 0x0

    const-string v14, "Missing digits for: "

    const/16 v9, 0x2d

    const/16 v10, 0x2b

    if-eqz p5, :cond_7

    .line 3
    iget-boolean v13, v1, Lhj/r;->x:Z

    if-eqz v13, :cond_7

    if-lt v6, v5, :cond_0

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lhj/r;->k:Lfj/p;

    invoke-interface {v3}, Lfj/p;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Lhj/s;->k(ILjava/lang/String;)V

    .line 5
    invoke-virtual/range {p2 .. p2}, Lhj/s;->n()V

    return-void

    .line 6
    :cond_0
    invoke-interface {v0, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    if-eq v3, v9, :cond_6

    if-ne v3, v10, :cond_1

    goto :goto_2

    .line 7
    :cond_1
    iget v3, v1, Lhj/r;->m:I

    add-int/2addr v3, v6

    .line 8
    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v5

    move v13, v6

    move-wide/from16 v9, v16

    :goto_0
    if-ge v13, v5, :cond_2

    .line 9
    invoke-interface {v0, v13}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v14

    sub-int/2addr v14, v12

    if-ltz v14, :cond_2

    const/16 v15, 0x9

    if-gt v14, v15, :cond_2

    const-wide/16 v16, 0xa

    mul-long v9, v9, v16

    int-to-long v14, v14

    add-long/2addr v9, v14

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_2
    const-wide/32 v14, 0x7fffffff

    cmp-long v0, v9, v14

    if-lez v0, :cond_3

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Lhj/s;->k(ILjava/lang/String;)V

    return-void

    :cond_3
    if-ge v13, v3, :cond_5

    if-ne v13, v6, :cond_4

    .line 11
    invoke-virtual {v2, v6, v7}, Lhj/s;->k(ILjava/lang/String;)V

    goto :goto_1

    .line 12
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lhj/r;->k:Lfj/p;

    .line 13
    invoke-interface {v3}, Lfj/p;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 14
    invoke-virtual {v2, v6, v0}, Lhj/s;->k(ILjava/lang/String;)V

    :goto_1
    return-void

    .line 15
    :cond_5
    iget-object v0, v1, Lhj/r;->k:Lfj/p;

    long-to-int v3, v9

    invoke-virtual {v4, v0, v3}, Lhj/t;->H(Lfj/p;I)V

    .line 16
    invoke-virtual {v2, v13}, Lhj/s;->l(I)V

    return-void

    .line 17
    :cond_6
    :goto_2
    invoke-virtual {v2, v6, v15}, Lhj/s;->k(ILjava/lang/String;)V

    return-void

    :cond_7
    const/4 v13, 0x0

    if-eqz p5, :cond_8

    .line 18
    iget v12, v1, Lhj/r;->v:I

    goto :goto_3

    :cond_8
    sget-object v12, Lgj/a;->s:Lfj/c;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v3, v12, v10}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v12

    :goto_3
    if-lez v12, :cond_9

    sub-int/2addr v5, v12

    :cond_9
    if-lt v6, v5, :cond_a

    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lhj/r;->k:Lfj/p;

    invoke-interface {v3}, Lfj/p;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Lhj/s;->k(ILjava/lang/String;)V

    .line 20
    invoke-virtual/range {p2 .. p2}, Lhj/s;->n()V

    return-void

    .line 21
    :cond_a
    iget-boolean v10, v1, Lhj/r;->q:Z

    if-eqz v10, :cond_d

    iget-object v10, v1, Lhj/r;->k:Lfj/p;

    instance-of v9, v10, Lij/a;

    if-eqz v9, :cond_d

    .line 22
    const-class v5, Lij/a;

    invoke-virtual {v5, v10}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lij/a;

    .line 23
    invoke-virtual/range {p2 .. p2}, Lhj/s;->e()Ljava/text/ParsePosition;

    move-result-object v7

    invoke-interface {v5, v0, v7, v3, v4}, Lij/a;->z(Ljava/lang/CharSequence;Ljava/text/ParsePosition;Lfj/d;Lfj/q;)Ljava/lang/Integer;

    move-result-object v0

    .line 24
    invoke-virtual/range {p2 .. p2}, Lhj/s;->i()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 25
    invoke-virtual/range {p2 .. p2}, Lhj/s;->c()I

    move-result v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unparseable element: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lhj/r;->k:Lfj/p;

    invoke-interface {v4}, Lfj/p;->name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lhj/s;->k(ILjava/lang/String;)V

    goto :goto_4

    :cond_b
    if-nez v0, :cond_c

    const-string v0, "No interpretable value."

    .line 26
    invoke-virtual {v2, v6, v0}, Lhj/s;->k(ILjava/lang/String;)V

    goto :goto_4

    .line 27
    :cond_c
    iget-object v2, v1, Lhj/r;->k:Lfj/p;

    invoke-virtual {v4, v2, v0}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    :goto_4
    return-void

    :cond_d
    if-eqz p5, :cond_e

    .line 28
    iget-object v9, v1, Lhj/r;->u:Lgj/j;

    .line 29
    invoke-virtual {v9}, Lgj/j;->n()Z

    move-result v10

    .line 30
    iget v13, v1, Lhj/r;->w:I

    move-object/from16 v20, v9

    .line 31
    iget-char v9, v1, Lhj/r;->t:C

    move/from16 v21, v13

    move v13, v9

    const/4 v9, 0x0

    move-object/from16 v24, v20

    move/from16 v20, v10

    move-object/from16 v10, v24

    goto :goto_6

    .line 32
    :cond_e
    sget-object v9, Lgj/a;->l:Lfj/c;

    sget-object v10, Lgj/j;->k:Lgj/j;

    invoke-interface {v3, v9, v10}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lgj/j;

    .line 33
    invoke-virtual {v9}, Lgj/j;->n()Z

    move-result v10

    .line 34
    invoke-direct {v1, v9}, Lhj/r;->b(Lgj/j;)I

    move-result v13

    move/from16 v21, v13

    .line 35
    sget-object v13, Lgj/a;->m:Lfj/c;

    .line 36
    invoke-interface {v3, v13}, Lfj/d;->b(Lfj/c;)Z

    move-result v22

    if-eqz v22, :cond_f

    .line 37
    invoke-interface {v3, v13}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Character;

    invoke-virtual {v13}, Ljava/lang/Character;->charValue()C

    move-result v13

    move-object/from16 v22, v9

    const/4 v9, 0x0

    goto :goto_5

    :cond_f
    if-eqz v10, :cond_10

    .line 38
    invoke-virtual {v9}, Lgj/j;->l()Ljava/lang/String;

    move-result-object v13

    move-object/from16 v22, v9

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Ljava/lang/String;->charAt(I)C

    move-result v13

    goto :goto_5

    :cond_10
    move-object/from16 v22, v9

    const/4 v9, 0x0

    const/16 v13, 0x30

    :goto_5
    move/from16 v20, v10

    move-object/from16 v10, v22

    :goto_6
    if-eqz p5, :cond_11

    .line 39
    iget-object v3, v1, Lhj/r;->r:Lgj/g;

    goto :goto_7

    :cond_11
    sget-object v9, Lgj/a;->f:Lfj/c;

    sget-object v4, Lgj/g;->l:Lgj/g;

    invoke-interface {v3, v9, v4}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgj/g;

    :goto_7
    if-eqz v20, :cond_13

    .line 40
    iget-boolean v9, v1, Lhj/r;->l:Z

    if-nez v9, :cond_12

    invoke-virtual {v3}, Lgj/g;->a()Z

    move-result v9

    if-nez v9, :cond_13

    .line 41
    :cond_12
    iget v9, v1, Lhj/r;->m:I

    .line 42
    iget v4, v1, Lhj/r;->n:I

    goto :goto_8

    :cond_13
    move/from16 v4, v21

    const/4 v9, 0x1

    :goto_8
    move-object/from16 v21, v8

    .line 43
    invoke-interface {v0, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    move-object/from16 v22, v7

    const/16 v7, 0x2d

    if-eq v8, v7, :cond_16

    const/16 v7, 0x2b

    if-ne v8, v7, :cond_14

    goto :goto_9

    .line 44
    :cond_14
    iget-object v7, v1, Lhj/r;->o:Lhj/x;

    sget-object v15, Lhj/x;->n:Lhj/x;

    if-ne v7, v15, :cond_15

    .line 45
    invoke-virtual {v3}, Lgj/g;->c()Z

    move-result v7

    if-eqz v7, :cond_15

    const-string v0, "Missing sign of number."

    .line 46
    invoke-virtual {v2, v6, v0}, Lhj/s;->k(ILjava/lang/String;)V

    return-void

    :cond_15
    move v7, v6

    move-object/from16 v23, v11

    const/4 v11, 0x0

    goto :goto_b

    .line 47
    :cond_16
    :goto_9
    iget-object v7, v1, Lhj/r;->o:Lhj/x;

    move-object/from16 v23, v11

    sget-object v11, Lhj/x;->k:Lhj/x;

    if-ne v7, v11, :cond_18

    iget-boolean v7, v1, Lhj/r;->l:Z

    if-nez v7, :cond_17

    .line 48
    invoke-virtual {v3}, Lgj/g;->c()Z

    move-result v7

    if-eqz v7, :cond_18

    .line 49
    :cond_17
    invoke-virtual {v2, v6, v15}, Lhj/s;->k(ILjava/lang/String;)V

    return-void

    .line 50
    :cond_18
    iget-object v7, v1, Lhj/r;->o:Lhj/x;

    sget-object v11, Lhj/x;->l:Lhj/x;

    if-ne v7, v11, :cond_19

    const/16 v7, 0x2b

    if-ne v8, v7, :cond_19

    .line 51
    invoke-virtual {v3}, Lgj/g;->c()Z

    move-result v7

    if-eqz v7, :cond_19

    const-string v0, "Positive sign not allowed due to sign policy."

    .line 52
    invoke-virtual {v2, v6, v0}, Lhj/s;->k(ILjava/lang/String;)V

    return-void

    :cond_19
    const/16 v7, 0x2d

    if-ne v8, v7, :cond_1a

    const/4 v7, 0x1

    goto :goto_a

    :cond_1a
    const/4 v7, 0x0

    :goto_a
    add-int/lit8 v6, v6, 0x1

    move v11, v7

    move v7, v6

    :goto_b
    if-lt v6, v5, :cond_1b

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lhj/r;->k:Lfj/p;

    .line 54
    invoke-interface {v3}, Lfj/p;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 55
    invoke-virtual {v2, v7, v0}, Lhj/s;->k(ILjava/lang/String;)V

    return-void

    .line 56
    :cond_1b
    iget-boolean v14, v1, Lhj/r;->l:Z

    if-nez v14, :cond_1f

    iget v14, v1, Lhj/r;->s:I

    if-lez v14, :cond_1f

    if-gtz v12, :cond_1f

    if-eqz v20, :cond_1d

    move v12, v6

    const/4 v14, 0x0

    :goto_c
    if-ge v12, v5, :cond_1c

    .line 57
    invoke-interface {v0, v12}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v15

    sub-int/2addr v15, v13

    if-ltz v15, :cond_1c

    move/from16 p5, v8

    const/16 v8, 0x9

    if-gt v15, v8, :cond_1e

    add-int/lit8 v14, v14, 0x1

    add-int/lit8 v12, v12, 0x1

    move/from16 v8, p5

    goto :goto_c

    :cond_1c
    move/from16 p5, v8

    goto :goto_e

    :cond_1d
    move/from16 p5, v8

    move v8, v6

    const/4 v14, 0x0

    :goto_d
    if-ge v8, v5, :cond_1e

    .line 58
    invoke-interface {v0, v8}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v12

    invoke-virtual {v10, v12}, Lgj/j;->j(C)Z

    move-result v12

    if-eqz v12, :cond_1e

    add-int/lit8 v14, v14, 0x1

    add-int/lit8 v8, v8, 0x1

    goto :goto_d

    .line 59
    :cond_1e
    :goto_e
    iget v8, v1, Lhj/r;->s:I

    sub-int/2addr v14, v8

    invoke-static {v4, v14}, Ljava/lang/Math;->min(II)I

    move-result v4

    goto :goto_f

    :cond_1f
    move/from16 p5, v8

    :goto_f
    add-int/2addr v9, v6

    add-int/2addr v4, v6

    .line 60
    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-eqz v20, :cond_21

    move-wide/from16 v14, v16

    :goto_10
    if-ge v6, v4, :cond_20

    .line 61
    invoke-interface {v0, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    sub-int/2addr v5, v13

    if-ltz v5, :cond_20

    const/16 v8, 0x9

    if-gt v5, v8, :cond_20

    const-wide/16 v18, 0xa

    mul-long v14, v14, v18

    move v12, v9

    int-to-long v8, v5

    add-long/2addr v14, v8

    add-int/lit8 v6, v6, 0x1

    move v9, v12

    goto :goto_10

    :cond_20
    move v12, v9

    goto :goto_12

    :cond_21
    move v12, v9

    const/4 v5, 0x0

    :goto_11
    if-ge v6, v4, :cond_22

    .line 62
    invoke-interface {v0, v6}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v8

    invoke-virtual {v10, v8}, Lgj/j;->j(C)Z

    move-result v8

    if-eqz v8, :cond_22

    add-int/lit8 v5, v5, 0x1

    add-int/lit8 v6, v6, 0x1

    goto :goto_11

    :cond_22
    if-lez v5, :cond_23

    sub-int v4, v6, v5

    .line 63
    :try_start_0
    invoke-interface {v0, v4, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0, v3}, Lgj/j;->p(Ljava/lang/String;Lgj/g;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    int-to-long v4, v0

    move-wide v14, v4

    goto :goto_12

    :catch_0
    move-exception v0

    .line 64
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v7, v0}, Lhj/s;->k(ILjava/lang/String;)V

    return-void

    :cond_23
    move-wide/from16 v14, v16

    .line 65
    :goto_12
    iget-object v0, v1, Lhj/r;->k:Lfj/p;

    invoke-interface {v0}, Lfj/p;->getType()Ljava/lang/Class;

    move-result-object v0

    const-wide/32 v4, 0x7fffffff

    cmp-long v4, v14, v4

    .line 66
    const-class v5, Ljava/lang/Integer;

    if-lez v4, :cond_24

    if-ne v0, v5, :cond_24

    .line 67
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v3, v23

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v7, v0}, Lhj/s;->k(ILjava/lang/String;)V

    return-void

    :cond_24
    move v4, v12

    if-ge v6, v4, :cond_27

    if-ne v6, v7, :cond_25

    move-object/from16 v8, v22

    .line 68
    invoke-virtual {v2, v7, v8}, Lhj/s;->k(ILjava/lang/String;)V

    return-void

    .line 69
    :cond_25
    iget-boolean v8, v1, Lhj/r;->l:Z

    if-nez v8, :cond_26

    invoke-virtual {v3}, Lgj/g;->a()Z

    move-result v8

    if-nez v8, :cond_27

    .line 70
    :cond_26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v3, v21

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lhj/r;->k:Lfj/p;

    .line 71
    invoke-interface {v3}, Lfj/p;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 72
    invoke-virtual {v2, v7, v0}, Lhj/s;->k(ILjava/lang/String;)V

    return-void

    :cond_27
    if-eqz v11, :cond_2a

    cmp-long v4, v14, v16

    if-nez v4, :cond_28

    .line 73
    invoke-virtual {v3}, Lgj/g;->c()Z

    move-result v3

    if-eqz v3, :cond_28

    const/4 v3, 0x1

    sub-int/2addr v7, v3

    const-string v0, "Negative zero is not allowed."

    .line 74
    invoke-virtual {v2, v7, v0}, Lhj/s;->k(ILjava/lang/String;)V

    return-void

    :cond_28
    neg-long v14, v14

    :cond_29
    move/from16 v3, p5

    goto :goto_13

    .line 75
    :cond_2a
    iget-object v8, v1, Lhj/r;->o:Lhj/x;

    sget-object v9, Lhj/x;->m:Lhj/x;

    if-ne v8, v9, :cond_29

    .line 76
    invoke-virtual {v3}, Lgj/g;->c()Z

    move-result v3

    if-eqz v3, :cond_29

    if-eqz v20, :cond_29

    move/from16 v3, p5

    const/16 v8, 0x2b

    if-ne v3, v8, :cond_2b

    if-gt v6, v4, :cond_2b

    add-int/lit8 v4, v7, -0x1

    const-string v9, "Positive sign only allowed for big number."

    .line 77
    invoke-virtual {v2, v4, v9}, Lhj/s;->k(ILjava/lang/String;)V

    goto :goto_13

    :cond_2b
    if-eq v3, v8, :cond_2c

    if-le v6, v4, :cond_2c

    const-string v4, "Positive sign must be present for big number."

    .line 78
    invoke-virtual {v2, v7, v4}, Lhj/s;->k(ILjava/lang/String;)V

    :cond_2c
    :goto_13
    if-ne v0, v5, :cond_2d

    .line 79
    iget-object v0, v1, Lhj/r;->k:Lfj/p;

    long-to-int v3, v14

    move-object/from16 v4, p4

    invoke-virtual {v4, v0, v3}, Lhj/t;->H(Lfj/p;I)V

    goto :goto_15

    :cond_2d
    move-object/from16 v4, p4

    .line 80
    const-class v5, Ljava/lang/Long;

    if-ne v0, v5, :cond_2e

    .line 81
    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    .line 82
    iget-object v3, v1, Lhj/r;->k:Lfj/p;

    invoke-virtual {v4, v3, v0}, Lhj/t;->I(Lfj/p;Ljava/lang/Object;)V

    goto :goto_15

    .line 83
    :cond_2e
    iget-object v5, v1, Lhj/r;->k:Lfj/p;

    sget-object v8, Lnet/time4j/f0;->C:Lnet/time4j/c0;

    if-ne v5, v8, :cond_2f

    .line 84
    sget-object v0, Lnet/time4j/f0;->D:Lnet/time4j/k0;

    long-to-int v3, v14

    invoke-virtual {v4, v0, v3}, Lhj/t;->H(Lfj/p;I)V

    goto :goto_15

    .line 85
    :cond_2f
    const-class v5, Ljava/lang/Enum;

    invoke-virtual {v5, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_34

    .line 86
    iget-object v0, v1, Lhj/r;->k:Lfj/p;

    instance-of v5, v0, Lgj/l;

    if-eqz v5, :cond_30

    .line 87
    check-cast v0, Lgj/l;

    long-to-int v5, v14

    .line 88
    invoke-interface {v0, v4, v5}, Lgj/l;->K(Lfj/q;I)Z

    move-result v13

    goto :goto_14

    :cond_30
    const/4 v13, 0x0

    :goto_14
    if-nez v13, :cond_33

    const/16 v0, 0x2d

    if-eq v3, v0, :cond_31

    const/16 v0, 0x2b

    if-ne v3, v0, :cond_32

    :cond_31
    add-int/lit8 v7, v7, -0x1

    .line 89
    :cond_32
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "["

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lhj/r;->k:Lfj/p;

    .line 90
    invoke-interface {v3}, Lfj/p;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "] No enum found for value: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14, v15}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 91
    invoke-virtual {v2, v7, v0}, Lhj/s;->k(ILjava/lang/String;)V

    return-void

    .line 92
    :cond_33
    :goto_15
    invoke-virtual {v2, v6}, Lhj/s;->l(I)V

    return-void

    .line 93
    :cond_34
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Not parseable: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Lhj/r;->k:Lfj/p;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public j(Lhj/c;Lfj/d;I)Lhj/h;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhj/c<",
            "*>;",
            "Lfj/d;",
            "I)",
            "Lhj/h<",
            "TV;>;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    sget-object v2, Lgj/a;->l:Lfj/c;

    .line 6
    .line 7
    sget-object v3, Lgj/j;->k:Lgj/j;

    .line 8
    .line 9
    invoke-interface {v1, v2, v3}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    move-object v13, v2

    .line 14
    check-cast v13, Lgj/j;

    .line 15
    .line 16
    sget-object v2, Lgj/a;->m:Lfj/c;

    .line 17
    .line 18
    invoke-interface {v1, v2}, Lfj/d;->b(Lfj/c;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/16 v5, 0x30

    .line 23
    .line 24
    const/4 v6, 0x0

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-interface {v1, v2}, Lfj/d;->c(Lfj/c;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Character;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :goto_0
    move v12, v2

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    invoke-virtual {v13}, Lgj/j;->n()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    invoke-virtual {v13}, Lgj/j;->l()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    move v12, v5

    .line 55
    :goto_1
    sget-object v2, Lgj/a;->s:Lfj/c;

    .line 56
    .line 57
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-interface {v1, v2, v4}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v15

    .line 71
    if-ne v13, v3, :cond_2

    .line 72
    .line 73
    if-ne v12, v5, :cond_2

    .line 74
    .line 75
    iget-boolean v2, v0, Lhj/r;->l:Z

    .line 76
    .line 77
    if-eqz v2, :cond_2

    .line 78
    .line 79
    if-nez v15, :cond_2

    .line 80
    .line 81
    iget-object v2, v0, Lhj/r;->k:Lfj/p;

    .line 82
    .line 83
    invoke-interface {v2}, Lfj/p;->getType()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const-class v3, Ljava/lang/Integer;

    .line 88
    .line 89
    if-ne v2, v3, :cond_2

    .line 90
    .line 91
    iget-boolean v2, v0, Lhj/r;->q:Z

    .line 92
    .line 93
    if-nez v2, :cond_2

    .line 94
    .line 95
    const/4 v2, 0x1

    .line 96
    move/from16 v16, v2

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    move/from16 v16, v6

    .line 100
    .line 101
    :goto_2
    new-instance v2, Lhj/r;

    .line 102
    .line 103
    iget-object v5, v0, Lhj/r;->k:Lfj/p;

    .line 104
    .line 105
    iget-boolean v6, v0, Lhj/r;->l:Z

    .line 106
    .line 107
    iget v7, v0, Lhj/r;->m:I

    .line 108
    .line 109
    iget v8, v0, Lhj/r;->n:I

    .line 110
    .line 111
    iget-object v9, v0, Lhj/r;->o:Lhj/x;

    .line 112
    .line 113
    iget-boolean v10, v0, Lhj/r;->p:Z

    .line 114
    .line 115
    sget-object v3, Lgj/a;->f:Lfj/c;

    .line 116
    .line 117
    sget-object v4, Lgj/g;->l:Lgj/g;

    .line 118
    .line 119
    invoke-interface {v1, v3, v4}, Lfj/d;->a(Lfj/c;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    move-object v14, v1

    .line 124
    check-cast v14, Lgj/g;

    .line 125
    .line 126
    move-object v4, v2

    .line 127
    move/from16 v11, p3

    .line 128
    .line 129
    invoke-direct/range {v4 .. v16}, Lhj/r;-><init>(Lfj/p;ZIILhj/x;ZICLgj/j;Lgj/g;IZ)V

    .line 130
    .line 131
    .line 132
    return-object v2
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x40

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "[element="

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lhj/r;->k:Lfj/p;

    .line 25
    .line 26
    invoke-interface {v1}, Lfj/p;->name()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", fixed-width-mode="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, Lhj/r;->l:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", min-digits="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget v1, p0, Lhj/r;->m:I

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", max-digits="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget v1, p0, Lhj/r;->n:I

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", sign-policy="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lhj/r;->o:Lhj/x;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", protected-mode="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-boolean v1, p0, Lhj/r;->p:Z

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const/16 v1, 0x5d

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
.end method
