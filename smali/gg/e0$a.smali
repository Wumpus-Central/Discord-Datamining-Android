.class final Lgg/e0$a;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgg/e0;-><init>(Ldi/g0;Lkotlin/jvm/functions/Function0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgg/e0$a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/util/List<",
        "+",
        "Ldg/j;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "Ldg/j;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "()Ljava/util/List;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field final synthetic k:Lgg/e0;

.field final synthetic l:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lgg/e0;Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgg/e0;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Ljava/lang/reflect/Type;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgg/e0$a;->k:Lgg/e0;

    iput-object p2, p0, Lgg/e0$a;->l:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method

.method public static final synthetic a(Lkotlin/Lazy;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lgg/e0$a;->b(Lkotlin/Lazy;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lkotlin/Lazy;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Lazy<",
            "+",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/reflect/Type;",
            ">;>;)",
            "Ljava/util/List<",
            "Ljava/lang/reflect/Type;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lgg/e0$a;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ldg/j;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lgg/e0$a;->k:Lgg/e0;

    invoke-virtual {v0}, Lgg/e0;->o()Ldi/g0;

    move-result-object v0

    invoke-virtual {v0}, Ldi/g0;->L0()Ljava/util/List;

    move-result-object v0

    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lkotlin/collections/h;->i()Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 4
    :cond_0
    sget-object v1, Llf/p;->l:Llf/p;

    new-instance v2, Lgg/e0$a$c;

    iget-object v3, p0, Lgg/e0$a;->k:Lgg/e0;

    invoke-direct {v2, v3}, Lgg/e0$a$c;-><init>(Lgg/e0;)V

    invoke-static {v1, v2}, Llf/m;->b(Llf/p;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    .line 5
    iget-object v2, p0, Lgg/e0$a;->l:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lgg/e0$a;->k:Lgg/e0;

    .line 6
    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v0, v5}, Lkotlin/collections/h;->t(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v7, v5, 0x1

    if-gez v5, :cond_1

    .line 8
    invoke-static {}, Lkotlin/collections/h;->s()V

    :cond_1
    check-cast v6, Ldi/k1;

    .line 9
    invoke-interface {v6}, Ldi/k1;->b()Z

    move-result v8

    if-eqz v8, :cond_2

    .line 10
    sget-object v5, Ldg/j;->c:Ldg/j$a;

    invoke-virtual {v5}, Ldg/j$a;->c()Ldg/j;

    move-result-object v5

    goto :goto_2

    .line 11
    :cond_2
    new-instance v8, Lgg/e0;

    invoke-interface {v6}, Ldi/k1;->getType()Ldi/g0;

    move-result-object v9

    const-string v10, "typeProjection.type"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v2, :cond_3

    const/4 v5, 0x0

    goto :goto_1

    :cond_3
    new-instance v10, Lgg/e0$a$a;

    invoke-direct {v10, v3, v5, v1}, Lgg/e0$a$a;-><init>(Lgg/e0;ILkotlin/Lazy;)V

    move-object v5, v10

    :goto_1
    invoke-direct {v8, v9, v5}, Lgg/e0;-><init>(Ldi/g0;Lkotlin/jvm/functions/Function0;)V

    .line 12
    invoke-interface {v6}, Ldi/k1;->a()Ldi/w1;

    move-result-object v5

    sget-object v6, Lgg/e0$a$b;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v6, v5

    const/4 v6, 0x1

    if-eq v5, v6, :cond_6

    const/4 v6, 0x2

    if-eq v5, v6, :cond_5

    const/4 v6, 0x3

    if-ne v5, v6, :cond_4

    .line 13
    sget-object v5, Ldg/j;->c:Ldg/j$a;

    invoke-virtual {v5, v8}, Ldg/j$a;->b(Lkotlin/reflect/KType;)Ldg/j;

    move-result-object v5

    goto :goto_2

    :cond_4
    new-instance v0, Llf/q;

    invoke-direct {v0}, Llf/q;-><init>()V

    throw v0

    .line 14
    :cond_5
    sget-object v5, Ldg/j;->c:Ldg/j$a;

    invoke-virtual {v5, v8}, Ldg/j$a;->a(Lkotlin/reflect/KType;)Ldg/j;

    move-result-object v5

    goto :goto_2

    .line 15
    :cond_6
    sget-object v5, Ldg/j;->c:Ldg/j$a;

    invoke-virtual {v5, v8}, Ldg/j$a;->d(Lkotlin/reflect/KType;)Ldg/j;

    move-result-object v5

    .line 16
    :goto_2
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v5, v7

    goto :goto_0

    :cond_7
    return-object v4
.end method
