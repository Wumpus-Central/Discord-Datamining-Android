.class public final synthetic Lbd/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lic/h;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lbd/h$a;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lbd/h$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbd/g;->a:Ljava/lang/String;

    iput-object p2, p0, Lbd/g;->b:Lbd/h$a;

    return-void
.end method


# virtual methods
.method public final a(Lic/e;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lbd/g;->a:Ljava/lang/String;

    iget-object v1, p0, Lbd/g;->b:Lbd/h$a;

    invoke-static {v0, v1, p1}, Lbd/h;->a(Ljava/lang/String;Lbd/h$a;Lic/e;)Lbd/f;

    move-result-object p1

    return-object p1
.end method
