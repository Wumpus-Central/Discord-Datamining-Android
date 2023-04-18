.class public final synthetic Lg2/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/g0;


# instance fields
.field public final synthetic a:Lg2/h;


# direct methods
.method public synthetic constructor <init>(Lg2/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/e;->a:Lg2/h;

    return-void
.end method


# virtual methods
.method public final onResult(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lg2/e;->a:Lg2/h;

    check-cast p1, Lg2/i;

    invoke-virtual {v0, p1}, Lg2/h;->setComposition(Lg2/i;)V

    return-void
.end method
