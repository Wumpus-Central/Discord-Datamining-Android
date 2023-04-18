.class public final synthetic Lj7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/g;


# instance fields
.field public final synthetic a:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj7/e;->a:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lj7/e;->a:Ljava/lang/Exception;

    check-cast p1, Lj7/v$a;

    invoke-static {v0, p1}, Lj7/h;->h(Ljava/lang/Exception;Lj7/v$a;)V

    return-void
.end method
