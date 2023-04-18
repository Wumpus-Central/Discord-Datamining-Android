.class public final synthetic Lqc/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsc/b;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/f;->a:Landroid/content/Context;

    iput-object p2, p0, Lqc/f;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lqc/f;->a:Landroid/content/Context;

    iget-object v1, p0, Lqc/f;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lqc/g;->c(Landroid/content/Context;Ljava/lang/String;)Lqc/l;

    move-result-object v0

    return-object v0
.end method
