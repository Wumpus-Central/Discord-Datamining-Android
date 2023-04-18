.class public final synthetic Lg2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/e0$b;


# instance fields
.field public final synthetic a:Lg2/e0;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lg2/e0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg2/u;->a:Lg2/e0;

    iput-object p2, p0, Lg2/u;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lg2/i;)V
    .locals 2

    iget-object v0, p0, Lg2/u;->a:Lg2/e0;

    iget-object v1, p0, Lg2/u;->b:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lg2/e0;->m(Lg2/e0;Ljava/lang/String;Lg2/i;)V

    return-void
.end method
