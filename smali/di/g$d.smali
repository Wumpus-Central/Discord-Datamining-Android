.class final Ldi/g$d;
.super Lkotlin/jvm/internal/s;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldi/g;-><init>(Lci/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/s;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/Boolean;",
        "Ldi/g$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Ldi/g$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldi/g$d;

    invoke-direct {v0}, Ldi/g$d;-><init>()V

    sput-object v0, Ldi/g$d;->k:Ldi/g$d;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/s;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Z)Ldi/g$b;
    .locals 1

    new-instance p1, Ldi/g$b;

    sget-object v0, Lfi/k;->a:Lfi/k;

    invoke-virtual {v0}, Lfi/k;->l()Ldi/g0;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/h;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p1, v0}, Ldi/g$b;-><init>(Ljava/util/Collection;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1}, Ldi/g$d;->a(Z)Ldi/g$b;

    move-result-object p1

    return-object p1
.end method
